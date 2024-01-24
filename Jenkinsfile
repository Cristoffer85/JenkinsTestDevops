pipeline {
    agent any
    tools {
        maven 'Maven'
    }

    stages {
        stage("build") {
            steps {
                echo 'building the application...'
                sh 'mvn -B clean package'
                echo 'building succeeded!'
            }
        }
        stage("test") {
            steps {
                script {
                    // Run tests and copy XML files to the workspace
                    sh 'mvn test'
                    dir('target/surefire-reports') {
                        cp '*.xml', '$WORKSPACE'
                    }
                }
            }
            post {
                always {
                    junit '*.xml'
                }
            }
        }
        stage("deploy") {
            steps {
                sh './jenkins/delivery.sh'
            }
        }
    }

    post {
        always {
            script {
                // Checks API configuration
                echo 'Setting up Checks API...'
                checks-api publishChecks checkName: 'Tests', reportFiles: 'target/surefire-reports/*.xml'
            }
        }
    }
}
