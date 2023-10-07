pipeline {
    agent any
    
    stages {
        stage("compile"){
            steps{
                 sh 'echo "Compile programe"'
                 sh 'cd src && javac App.java'
            }
        }
        stage("Run"){
            steps{
                 sh 'echo "Run programe"'
                 sh 'cd src && java App'
            }
        }
    }
}