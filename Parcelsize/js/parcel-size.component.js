angular.
  module('parcelConfig').
  component('parcelSize', {
	  transclude: true,
	  template:

		  '<form class="w3-container">'+
		  	'<div class="w3-panel w3-card-2">'+
					'<div class="w3-container w3-teal">'+
						'<h2>Paketgroesse</h2>'+
		    	'</div>'+
					'<form class="w3-container" ng-submit="$ctrl.UpdateSize()">'+

						'<div class="w3-row">'+
							'<h4>Laenge</h4>'+
   		  			'<input class="w3-input" id="cfg-recp-name" type="text" ng-model="$ctrl.parcelsize.length">'+
						'</div>'+

						'<div class="w3-row">'+
							'<h4>Breite</h4>'+
							'<input class="w3-input" id="cfg-recp-name" type="text" ng-model="$ctrl.parcelsize.width">'+
						'</div>'+

						'<div class="w3-row">'+
							'<h4>Hoehe</h4>'+
							'<input class="w3-input" id="cfg-recp-name" type="text" ng-model="$ctrl.parcelsize.height">'+
						'</div>'+


							'<div class="w3-container">'+
								'<h4>Groesse: {{testSize}}</h4>'+
							'</div>'+


						'<div class="w3-row">'+
							'<div class="w3-cell">'+
								'<button class="w3-button w3-teal" ng-click="" >'+
									'<h4>Groesse berechnen</h4>'+
								'</button>'+
							'</div>'+
							'<div class="w3-cell">'+
								'<div class="w3-container">'+
									'<h4>Groesse: {{$ctrl.parcelsize.size}}</h4>'+
								'</div>'+
							'</div>'+
						'</div>'+
					'</form>'+
		  	'</div>'+
		  '</form>'+
		  '<br />'+
		  '</div>' ,


    controller: function ParcelSizeController($rootScope, $http, $window) {
    
    	this.getSize = function(){
    		$rootScope.parcelsize = "";
    		data = {params:{length: this.length, width: this.width, height: this.heigth, size: null}};
    		
    		$http.get("http://www.allgaeu-parcel-service.de:4711/rest/parcel/size/", data)
    		 .then(function(response)){
    			$rootScope.parcelsize = response.data;
    		});
    	};
    	
    }
});
