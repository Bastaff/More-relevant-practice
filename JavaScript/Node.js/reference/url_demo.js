const url = require('url');

const myUrl = new URL('http://mywebsite.com/hello.html?id=100&status=active');

// Srerialized URL
console.log(myUrl.href);
console.log(myUrl.toString());

//Host (root domain)
console.log(myUrl.host);

//Hostname (does not get port)
console.log(myUrl.hostname);

// Pathname
console.log(myUrl.pathname);

//Serialized query (everything after question mark)
console.log(myUrl.search);

// Params object
console.log(myUrl.searchParams);

// Adding parameters
myUrl.searchParams.append('User', 'Bob');
console.log(myUrl.searchParams);

// Loop through params
myUrl.searchParams.forEach((value, name) => console.log(`${name}, ${value}`));

