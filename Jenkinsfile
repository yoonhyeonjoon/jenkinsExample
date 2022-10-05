pipeline {

  agent any
  stages{
    stage('version - check'){
      steps{         
        bat 'python3 --version'
        bat 'java --version'
      }
    }
    stage('python-stage'){
      steps{ 
        bat 'python hello.py'
      }
    }
            
    stage('kotlin-stage'){
      steps{ 
        bat 'kotlinc kotlinTest.kt -d kotlinTest.jar'
        bat 'kotlin -classpath kotlinTest.jar kotlinTestKt'
      }
    }
    
    
  }
}
