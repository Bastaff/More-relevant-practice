const express = require('express');
const router = express.Router();
// path to Members file containing members json
const members = require('../../Members' );

// Get all params of a json object
router.get('/', (req, res) => {
    res.json(members);
});


// Get single param of json object
router.get('/:id', (req, res) => {
    const found = members.some(member => member.id === parseInt(req.params.id));
    
    if (found){
        res.json(members.filter(member => member.id === parseInt(req.params.id)));
    } else {
        res.status(400).json({msg: `No member with id: ${req.params.id}`});
    }
    
});

// Create Member
router.post('/', (req, res) => {
    res.send(req.body);
});


module.exports = router;

