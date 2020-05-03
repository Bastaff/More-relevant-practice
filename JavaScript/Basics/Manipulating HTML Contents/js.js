window.onload = init;
 
function init() {
  document.getElementById("btn1").onclick = changeHeading1;
  document.getElementById("btn2").onclick = changeHeading2;
  document.getElementById("btn3").onclick = changeParagraph;
}
 
function changeHeading1() {
  var elm = document.getElementById("heading1");  // One element
  elm.innerHTML = "Hello";
}
 
function changeHeading2() {
  var elms = document.getElementsByTagName("h2");  // Array of elements
  for (var i = 0; i < elms.length; i++) {
    elms[i].innerHTML = "Hello again!";
  }
}
 
function changeParagraph() {
  var elms = document.getElementsByClassName("para");  // Array of elements
  for (var i = 0; i < elms.length; i++) {
    elms[i].innerHTML = "Hello again and again!";
  }
}