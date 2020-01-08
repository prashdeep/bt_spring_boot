Spring aop aspectJ pointcut expression


 Match all methods within a class in another package

   Preceding wildcard matches methods with any modifier 
     (public, protected, and private) and any return type. The two dots in the argument list match any number of arguments.

execution(* com.howtodoinjava.EmployeeManager.*(..))

 Match all methods within a class within same package

execution(* EmployeeManager.*(..))

 Match all public methods in EmployeeManager
 Use public keyword in start, and use * to match any return type.

execution(public * EmployeeManager.*(..))
1.4. Match all public methods in EmployeeManager with return type EmployeeDTO
Use public keyword and return type in start.

execution(public EmployeeDTO EmployeeManager.*(..))
1.5. Match all public methods in EmployeeManager with return type EmployeeDTO and first parameter as EmployeeDTO
Use public keyword and return type in start. Also, specify your first parameter as well. Rest parameters can be matched through two dots.

execution(public EmployeeDTO EmployeeManager.*(EmployeeDTO, ..))
1.6. Match all public methods in EmployeeManager with return type EmployeeDTO and definite parameters
Use public keyword and return type in start. Also, specify all parameter types as well.

execution(public EmployeeDTO EmployeeManager.*(EmployeeDTO, Integer))
1. How to match class type signature patterns
When applied to Spring AOP, the scope of these pointcuts will be narrowed to matching all method executions within the certain types only.

2.1. Match all methods defined in classes inside package com.howtodoinjava
It’s much like previous example.

within(com.howtodoinjava.*)
2.2. Match all methods defined in classes inside package com.howtodoinjava and classes inside all sub-packages as well
For including, sub-packages use two dots.

within(com.howtodoinjava..*)
2.3. Match all methods with a class in another package
Much like previous example using execution keyword.

within(com.howtodoinjava.EmployeeManagerImpl)
2.4. Match all methods with a class in same package
In case of same package, drop package name.

within(EmployeeManagerImpl)
2.5. Match all methods within all all implementing classes of EmployeeManager interface
Use + (plus) sign to match all implementations of an interface.

within(EmployeeManagerImpl+)
3. How to match class name patterns
You can match all beans as well having a common naming pattern e.g.

3.1. Match all methods defined in beans whose name ends with ‘Manager’.
It’s quite easy one. Use an * to match anything preceding in bean name and then matching word.

bean(*Manager)
4. How to combine pointcut expressions
In AspectJ, pointcut expressions can be combined with the operators && (and), || (or), and ! (not). e.g.

4.1. Match all methods with names ending with Manager and DAO
Use '||' sign to combine both expressions.

bean(*Manager) || bean(*DAO)
I hope that above information will help you when you face any difficulty in determining the correct pointcut expression in your application.