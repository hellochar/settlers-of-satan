var html = require('fs').readFileSync('settlers.html');
var server = require('http').createServer(function(req, res){
  res.end(html); //send the html file whenever an HTTP request is made
}); //create the server.
server.listen(8080); //listen on port 8080

var nowjs = require("now"); //create "now"
var everyone = nowjs.initialize(server); //initialize with server
var players = {}

everyone.now.takeAction = function(json) {
	json["owner"] = this.now.name;
	everyone.now.getAction(json);
}

everyone.now.broadcastAttributes = function(attrs) {
	everyone.now.updatePlayer(this.now.name, attrs);
}

nowjs.on('connect', function(){
	this.now.updateBlock();
});

everyone.now.distributeMessage = function(msg){
	everyone.now.receiveMessage(this.now.name, msg);	
};
