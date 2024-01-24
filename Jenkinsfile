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
                sh 'mvn test'
            }
            post {
                always {
                    junit '**/test-reports/*.xml'
                }
            }
        }
        stage("deploy") {
            steps {
                sh 'sudo ./jenkins/delivery.sh'
            }
        }
    }
}

