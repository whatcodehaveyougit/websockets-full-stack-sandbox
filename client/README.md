#  Full stack sandbox

Challenges setting this up

In the backend Employee Class I named the table "Employees" instead of employees, as a result the tables did not sync up.  This can be seen next to the @Entity annotation

I used Spring Initialiser to create the project, once this was done I went into resources -> application.properties and added the database name of the database I created locally.

### The Back End

I first created the Employee class.  Next was EmployeeRepo, this inherits from the JPA Repository <Employee, Long>. Last was the Employee Controller, here I mapped the named of the URL route to the name of the table (both employees).  In this route I include the EmployeeRepository which will now show up as the JSON Api for this route. 

### Dataloader

To begin with some data I simply created a Dataloader with the @Component annotation.


# The Front End

To begin I used npx create-react-app client. 

I then created a Dashboard file and used useEffect to load in the data from the employees Api on page load.  

Now the front end is serving data from the API.

I had some problems with CORs, eventually I found the soluation which can be found in the file SpringGlobalConfig in the backend.  I still do have localhost:8080 though in the fetch which is not ideal.

On the employee controller I included:
@CrossOrigin(origins = "http://localhost:3000")