var html = require('fs').readFileSync('settlers.html');
var server = require('http').createServer(function(req, res){
  res.end(html); //send the html file whenever an HTTP request is made
}); //create the server.
server.listen(8080); //listen on port 8080

var nowjs = require("now"); //create "now"
var everyone = nowjs.initialize(server); //initialize with server
var allAttributes = {};

everyone.now.takeAction = function(json) {
	json["owner"] = this.now.name;
	everyone.now.getAction(json);
}

everyone.now.setAttributes = function(attr) {
	allAttributes[this.now.name] = attr;
}

everyone.now.joinGame = function(attr) {
	allAttributes[this.now.name] = attr;
	everyone.now.setPlayers(allAttributes);
}

everyone.now.mousePressed = function(mousePressed, mouseButton, key, keyCode) { //begin charging
	var p = players[this.now.name];
	p.charging = 5;
}

everyone.now.mouseReleased = function(mousePressed, mouseButton, key, keyCode) { //begin charging
	var p = players[this.now.name];
	//shot the web
	add(new EShot(p, inputs[this.now.name].mouse.x, inputs[this.now.name].mouse.y, p.charging));
	delete p.charging;
}
