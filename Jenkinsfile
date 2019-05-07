node {
	stage('Preparation'){
        	checkout scm   
        
    	}
    	stage('Build'){
       		sh 'gradle build'
		sh 'docker build -t parcelsize .'		}
    	}
    	stage('Integration'){
        	sh 'echo "Hello World!"'
    	}
    	stage('UAT'){
        	sh 'echo "Hello World!"'
    	}
    	stage('Capacity'){
        	sh 'echo "Hello World!"'
    	}
    	stage('Manual'){
        	sh 'echo "Hello World!"'
    	}
    	stage('Release'){
        	sh 'echo "Hello World!"'
    	}
}
