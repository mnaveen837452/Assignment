# Assignment
# Available classes interfaces
# 1) PalindromeController
    # Used to declare end(acts as controller)
# 2) PalindromeServiceImpl
    # Contains method implementatione for palindromeService interface
# 3) QlikAssignmentApplication
    # It is the starting point of the applicaion
# 4) PalindromeService
    # Interface having method declarations for palindrome related operations.
# How to Build, Deploye and test
    # We have to build the project usig maven,
    # This project created using spring boot so internakky it contains the tomcat server we can run the application and test by hitting the end point like below
    # URL : http://localhost:8080/palindrome/is_palindrome?inputValue=level
    # Response : true or false
    # URL : http://localhost:8080/palindrome/palindrome_counts
    # Response : {
    #               "level": 1
    #            }
