pipeline {

  agent any
  tools {
      maven 'Maven'
  }

  stages {

    stage("build"){

      steps {
          echo 'building the application...'
          sh 'mvn clean install'
          echo 'building succeded!'
      }
    }
    stage("test"){

      steps {
          echo 'testing the application...'
          echo 'testing succeded!'
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
