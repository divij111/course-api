pipeline{
    agent any
    stages{
        stage('hello world'){
            steps{
                echo "Hello World"
            }
        }
        stage('test'){
            steps{
                git 'https://github.com/divij111/Mausam.com.git'
            }
        }
        stage('deploy'){
            steps{
                echo "Deploying the application..."
            }
        }
    }
}
