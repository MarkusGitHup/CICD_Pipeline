node {
	agent {
		dockerfile true
	}
	
	stage('Preparation'){
        	checkout scm   
        
    	}
    	stage('Build'){
       		steps{
			sh 'echo myCustomEnvVar = $myCustomEnvar'
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
