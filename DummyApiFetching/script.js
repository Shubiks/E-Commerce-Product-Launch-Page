// script.js

// Function to fetch and display employees
async function fetchEmployees() {
    try {
        const response = await fetch('https://dummy.restapiexample.com/api/v1/employees');
        const data = await response.json();
        const employees = data.data; // Accessing the employee array

        const employeeList = document.getElementById('employee-list');
        employeeList.innerHTML = ''; // Clear existing content

        employees.forEach(employee => {
            // Create employee card
            const employeeCard = document.createElement('div');
            employeeCard.classList.add('employee-card');

            // Employee name
            const name = document.createElement('h2');
            name.textContent = employee.employee_name;

            // Employee salary
            const salary = document.createElement('p');
            salary.textContent = `Salary: $${employee.employee_salary}`;

            // Employee age
            const age = document.createElement('p');
            age.textContent = `Age: ${employee.employee_age}`;

            // Append elements to employee card
            employeeCard.appendChild(name);
            employeeCard.appendChild(salary);
            employeeCard.appendChild(age);

            // Append employee card to employee list
            employeeList.appendChild(employeeCard);
        });
    } catch (error) {
        console.error('Error fetching employees:', error);
    }
}

// Call the function on page load
fetchEmployees();
