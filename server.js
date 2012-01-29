var html = require('fs').readFileSync('settlers.html');
var server = require('http').createServer(function(req, res){
  res.end(html); //send the html file whenever an HTTP request is made
}); //create the server.
server.listen(8080); //listen on port 8080

var nowjs = require("now"); //create "now"
var everyone = nowjs.initialize(server); //initialize with server

everyone.now.takeAction = function(json) {
	json["owner"] = this.now.name;
	everyone.now.getAction(json);
}

everyone.now.broadcastAttributes = function(attrs) {
	everyone.now.updatePlayer(this.now.name, attrs);
}

var players = [{name: "Joey", 
				hand: {	ore: 0,
						brick: 0,
						lumber: 0,
						wool: 1, 
						grain: 2}, 
				cards: {victorypoints: 1,
						knights: 0,
						monopolies: 0,
						yearofplenty: 0,
						roadbuilding: 0},
				victorypoints: 4},
				{name: "Amy",
				hand: {ore: 2,
						brick: 2,
						lumber: 0,
						wool: 0,
						grain: 0},
				cards: {victorypoints: 0,
						knights: 0,
						monopolies: 1,
						yearofplenty: 0,
						roadbuilding: 0},
				victorypoints: 5}]

nowjs.on('connect', function(){
	this.now.updateBlock(players);
});

everyone.now.distributeMessage = function(msg){
	everyone.now.receiveMessage(this.now.name, msg);	
};
