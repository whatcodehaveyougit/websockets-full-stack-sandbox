var SockJS = require('sockjs-client');
const Stomp = require('stompjs');


export default function register(registrations) {
		var socket = SockJS('/employees');
		var stompClient = Stomp.over(socket);
		stompClient.connect({}, function(frame) {
			registrations.forEach(function (registration) {
			  stompClient.subscribe(registration.route, registration.callback);
			});
		});

	return {
		register: register
	};
	}
;


