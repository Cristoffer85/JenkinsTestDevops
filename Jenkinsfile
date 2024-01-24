pipeline {

  agent any
  tools {
      maven 'Maven'
  }

  stages {

    stage("build"){

      steps {
          echo 'building the application...'
          sh 'mvn -B clean package'
          echo 'building succeded!'
      }
    }
    stage("test"){

      steps {
          sh 'mvn test'
          echo 'testing the application...'
          echo 'testing succeded!'
      }
        post {
            always {
                junit 'target/surefire-reports/*.xml'
      }
    }
    stage("deploy"){

      steps {
          echo 'deploying the application...'
          echo 'deploy succeded!'
      }
    }
  }
}
