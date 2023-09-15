pipline {
    agent any
    tools {
        terraform 'terraform'
    }
    stages {
        stage('downloading from git'){
            steps{
                git branch: 'main',  url: 'https://github.com/karthiksaki/dummy'
            }
        }
        stage('Terraform Init'){
            steps{
                sh 'terraform init'
            }
        }
        stage('Terraform Plan'){
            steps{
                sh 'terraform plan'
            }
        }
        stage('Terraform Apply'){
            steps{
                sh 'terraform apply'
            }
        }
    }
}