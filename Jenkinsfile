node {
	stage('Preparation'){
        	git credentialsId: '6030c8a4-b481-417a-97e2-056eb153e4d9', branch: 'master', url: 'https://github.com/MarkusGitHup/CICD_Pipeline.git'   
        
    	}
    	stage('Build'){
       		dir('/var/lib/jenkins/workspace/Parcelsize-Pipeline/Parcelsize') {
       		    sh 'gradle build'
       		    sh 'docker build -t parcelsizeimage .'   
       		}
    	}
    	stage('Integration'){
        	// produktiv
        	//dir ('/var/lib/jenkins/workspace/Parcelsize-Pipeline/vagrant/prod'){
        	// testserver
        	dir ('/var/lib/jenkins/workspace/Parcelsize-Pipeline/vagrant/test'){
        	sh 'rm -rf .vagrant'
        	sh 'vagrant destroy -f'
        	sh 'vagrant up'
        	}
        	
        	sh 'docker save -o /var/lib/jenkins/parcelsizeimage.tar parcelsizeimage'
        	sh 'docker save -o /var/lib/jenkins/databaseimage.tar databaseimage'
        	sh 'docker save -o /var/lib/jenkins/tomcatimage.tar tomcatimage'
        	    
        	//Asset-Server
        	dir ('/var/lib/jenkins/workspace/Parcelsize-Pipeline/vagrant/asset'){
        	sh 'rm -rf .vagrant'
        	sh 'vagrant destroy -f'
        	sh 'vagrant up'
        	    
        	sh 'vagrant ssh 6ba9f96 -c "wget -nH -r ip/ -P ./"'
        	}
        	
        	
        	
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
