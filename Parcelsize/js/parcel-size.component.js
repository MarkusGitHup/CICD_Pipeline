angular
		.module('parcelConfig')
		.component(
				'parcelSize',
				{
					transclude : true,
					template : '<div class="w3-panel w3-card-2">'
							+ '<div class="w3-container w3-teal">'
							+ '<h2>Paketgröße</h2>'
							+ '</div>'
							+

							'<form class="w3-container">'
							+ '<div class="w3-cell">'
							+

							'<div class="w3-cell">'
							+ '<label>Länge</label>'
							+ '<input class="w3-input" id="cfg-package-length" type="text" placeholder="0" ng-model="$ctrl.parcelsize.length">'
							+ '</div>'
							+

							'<div class="w3-row">'
							+ '<div class="w3-cell">'
							+ '<label>Breite</label>'
							+ '<input class="w3-input" id="cfg-package-width" type="text" placeholder="0" ng-model="$ctrl.parcelsize.width">'
							+ '</div>'
							+ '</div>'
							+

							'<div class="w3-row">'
							+ '<div class="w3-cell">'
							+ '<label>Tiefe</label>'
							+ '<input class="w3-input" id="cfg-package-depth" type="text" placeholder="0" ng-model="$ctrl.parcelsize.height">'
							+ '</div>'
							+ '</div>'
							+ '</div>'
							+

							'<button id="button" class="w3-button w3-purple" ng-click="$ctrl.getSize()">Größe berechnen</button>'
							+ '<label>Paketgröße: </label>'
							+ '<a id="size">{{$ctrl.parcelsize.size}}</a>' +

							'</form>' + '</div>',

					controller : function ParcelSizeController($rootScope,
							$http) {

						var self = this;

						this.parcelsize = {
							length : "0",
							width : "0",
							height : "0",
							size : ""
						};

						this.getSize = function() {

							data = {
								length : this.parcelsize.length,
								width : this.parcelsize.width,
								height : this.parcelsize.height,
								size : this.parcelsize.size
							};
							
							console.log (this.parcelsize.length);
							// $rootScope.parcelsize = "";

							// data = {params:{length: this.length, width:
							// this.width,
							// height: this.height, size: null}};
							// $http.get("http://192.168.50.1:8082/rest/parcel/size/",
							// data)
							// .then(function(response) {
							// $rootScope.parcelsize = response.data;
							// });

							// };
							// }

							// });

							var url = "http://localhost:8082/rest/parcel/length/"
									+ this.parcelsize.length + "/width/"
									+ this.parcelsize.width + "/height/"
									+ this.parcelsize.height;
							$http({
								method : 'GET',
								url : url
							}).then(function(response) {
								console.log(response.data);
								self.parcelsize.size = response.data.size;
							}, function errorCallback(response) {
								// error
								console.log(response);
							});
						}
					}
				});
