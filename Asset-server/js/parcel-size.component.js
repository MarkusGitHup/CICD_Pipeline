
angular.
  module('parcelConfig').
  component('parcelSize', {
	  transclude: true,
	  template:
    	'<div class="w3-panel w3-card-2">'+
    		'<div class="w3-container w3-teal">'+
    			'<h2>Paketgröße</h2>'+
    		'</div>' +
    		
    		'<form class="w3-container">'+
    			'<div class="w3-cell">'+

    	  
		    	  '<div class="w3-cell">'+
		   		  '<label>Länge</label>'+
		   		  '<input class="w3-input" id="cfg-package-length" type="text" placeholder="0" ng-model="$ctrl.length">'+
		   		  '</div>'+
		   		  
		   		  '<div class="w3-row">'+
			   		  '<div class="w3-cell">'+
			   		  '<label>Breite</label>'+
			   		  '<input class="w3-input" id="cfg-package-width" type="text" placeholder="0" ng-model="$ctrl.width">'+
			   		  '</div>'+
		   		  '</div>'+
		   		  
		   		  '<div class="w3-row">'+
			   		  '<div class="w3-cell">'+
			   		  '<label>Tiefe</label>'+
			   		  '<input class="w3-input" id="cfg-package-depth" type="text" placeholder="0" ng-model="$ctrl.height">'+
			   		  '</div>'+
		   		  '</div>'+
		   		  '</div>'+
		   		  
		   		  
		   	      '<button id="button" class="w3-button w3-purple" ng-click="$ctrl.getSize()">Größe berechnen</button>' +
		   	      '<label>Paketgröße: </label>' +
		   	      '<a id="size">{{$root.parcelsize.size}}</a>'+
		   	       
   		  '</form>'+
   		  '</div>',
    	
   		  
   	    controller: function ParcelSizeController($rootScope, $http) {
	  	  		
	  		this.getSize = function(){
	  			
	  		   $rootScope.parcelsize = "";
	  		   
	  		   data = {params:{length: this.length, width: this.width, height: this.height, size: null}};
	  			
	  		   $http.get("http://192.168.50.1:8082/rest/parcel/size/", data)
	  	       	.then(function(response) {	  

	  	            $rootScope.parcelsize = response.data;
	  	        });
	  	       	
	  		};	  		
  }

  });
  
 
  