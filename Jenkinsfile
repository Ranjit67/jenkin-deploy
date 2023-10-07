piplines{
    stages{
        stage("compile"){
            step{
                sh 'echo "Compile programe"'
                sh 'cd src'
                sh 'javac App.java'
            }
        }
        stage("Run"){
            step{
                sh 'echo "Run programe"'
                sh 'cd src'
                sh 'javac App'
            }
        }
    }
}

pipeline {
    agent any
    
    stages {
        stage("compile"){
            steps{
                 sh 'echo "Compile programe"'
                 sh 'cd src'
                 sh 'javac App.java'
            }
        }
        stage("Run"){
            steps{
                 sh 'echo "Run programe"'
                 sh 'cd src'
                 sh 'javac App'
            }
        }
    }
}