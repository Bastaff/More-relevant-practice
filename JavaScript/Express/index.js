const express = require('express');
// path needed to send files in get response
const path = require('path');
const logger = require('./middleware/logger');
const app = express();

// start the ^logger proccess which is a middleware
app.use(logger);

// Body parser middleware
app.use(express.json());
app.use(express.urlencoded({ extended: false }));


// Express way where you create a Static Folder
app.use(express.static(path.join(__dirname, 'public')));

app.use('/api/members', require('./routes/api/members'));


const PORT = process.env.PORT || 5000;

app.listen(PORT, () => console.log(`Server started on: ${PORT}`));