# Java Basic Objects Practice

/
1. What is the knowledge point of the test? Where is the official document to the knowledge point?
2. Why the test failed at first?
3. Why you corrected the test that way?
4. Do you have further questions on this knowledge point?
/

## ExceptionTest

should_customize_exception
1. How to create custom exceptions with custom messages.
2. The StringFormatException exception is thrown but it is not accompanied with any message.
3. Calling the constructor of the super class Exception that accepts a string calls the super class Throwable which assigns the string to the detailMessage that is returned by the getMessage() method
4. No

should_customize_exception_continued
1. How to create custom exceptions with custom messages and causes.
2. The StringFormatException exception is thrown but it is not accompanied with any message or cause.
3. Calling the constructor of the super class Exception that accepts a string and Throwable calls the super class Throwable which assigns the string to the detailMessage that is returned by the getMessage() method and assigns the Throwable to the cause returned by getCause()
4. No

should_be_careful_of_the_order_of_finally_block
1. That the 'finally' sections of try-catch-finally blocks are always executed at the end.
2. The expected result is intentionally incorrect.
3. Determined that the value remains the same value (2) by the time it reaches the finally block because the value variable itself was not changed. The if clause in the finally block returns 0 if the value is 2, so 0 should be the return of the method.
4. No

should_use_the_try_pattern
1.
2.
3.
4.

should_call_closing_even_if_exception_throws
1.
2.
3.
4.

should_get_method_name_in_stack_frame
1. How to use Thread and StackTrace to get the class and method names.
2. The getCurrentMethodName() method is not implemented.
3.
4.

## InheritanceTest

should_be_derived_from_object_class
1. The super class of all classes is the Object class
2. The expected output it set to null
3. It is stated that all classes in Java extend the Object class
4.

should_call_super_class_constructor
1.
2.
3.
4.

