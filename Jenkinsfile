node {
	stage('Preparation'){
        	checkout scm   
        
    	}
    	stage('Build'){
       		docker.image('node:parcelsizeimage').inside {
			stage('Test'){
				sh 'node --version'
			}
		}
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
