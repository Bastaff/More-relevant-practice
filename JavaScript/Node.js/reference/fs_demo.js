const fs = require('fs');
const path = require('path');

// Create folder
// fs.mkdir(path.join(__dirname, '/test'), {}, function(err){
//     if(err) throw err;
//     console.log('folder created')
// });

// // Create and write to file 
// fs.writeFile(path.join(__dirname, '/test', 'hello.txt'), 'Wrote text in file', err => {
//     if (err) throw err;
//     console.log('File Created and written in')

//     // File append
//     fs.appendFile(path.join(__dirname, '/test', 'hello.txt'), 'I kinda like node.js', err => {
//         if (err) throw err;
//         console.log('File Created and written in')
//     });

// });


// Read file
//  fs.readFile(path.join(__dirname, '/test', 'hello.txt'), 'utf8', (err, data) => {
//      if(err) throw err;
//      console.log(data)
//  });

//Rename File
fs.rename(path.join(__dirname, '/test', 'hello.txt'), path.join(__dirname, '/test', 'Renamed Document.txt'), (err) => {
    if(err) throw err;
    console.log('File Renamed')
});