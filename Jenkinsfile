  env.MYTOOL_VERSION = '1.33'
// node {
//   sh '/usr/local/mytool-$MYTOOL_VERSION/bin/start'
// }

//   test1["there"] = {
//     stage("there"){
//       println($MYTOOL_VERSION)
//     }
//   }

pipeline {

  
  agent any
  stages{
    stage('version - check'){
      steps{         
        bat '$MYTOOL_VERSION'
        bat 'python3 --version'
        bat 'java --version'
        bat 'kotlin -version'
        bat 'scala -version'
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
        bat 'kotlin -classpath kotlinTest.jar KotlinTestKt'
      }
    }
        
    stage('java-stage'){
      steps{ 
        bat 'javac JavaTest.java'
        bat 'java JavaTest'
      }
    }
    
    stage('scala-stage'){
      steps{ 
        bat 'scalac scalaTest.scala'
        bat 'scala futures.futureTest'
      }
    }
    
  }
}
