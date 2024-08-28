/**
 * 
 */
//basic athentific header file 
const username = 'yourUsername';
const password = 'yourPassword';
const headers = new Headers();
headers.append('Authorization', 'Basic ' + btoa(username + ':' + password));

// Example for fetching data
fetch('http://localhost:8080/api/stocks', {
    method: 'GET',
    headers: headers
})
.then(response => response.json())
.then(data => console.log(data))
.catch(error => console.error('Error:', error));

//user athuetification of can you storing API Validations :
//inspect error message created n:
fetch('http://localhost:8080/api/stocks', {
    method: 'GET',
    headers: {
        'Authorization': 'Basic ' + credentials
    }
})
.then(response => {
    if (response.status === 401) {
        console.error('Unauthorized: Check your credentials');
    } else if (!response.ok) {
        console.error('Error:', response.statusText);
    }
    return response.json();
})
.then(data => console.log(data))
.catch(error => console.error('Error:', error));



