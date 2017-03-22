pipeline {
	agent any
	tools {
		maven 'Maven 3.3.9'
	}
	stages {
		stage('Initialize') {
			steps {
				echo 'Initialize...'
			}
		}
		stage('Build') {
			steps {
				echo 'Build...'
				sh 'mvn clean package'
			}
		}
	}
}
