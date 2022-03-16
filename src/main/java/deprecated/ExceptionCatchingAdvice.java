//package deprecated;
//
//
//import java.util.Arrays;
//
//@Aspect
//public class ExceptionCatchingAdvice {
//
//	@Around("execution(@ExceptionCatcher * *.*(..)) && @annotation(ExceptionCatcher)"
//  ) public Object handle(ProceedingJoinPoint pjp, ExceptionCatcher catcher)
//  throws Throwable { try { // execute advised code return pjp.proceed(); }
//  catch (Throwable e) { // check exceptions specified in annotation contain
//  thrown exception if (Arrays.stream(catcher.exceptions()) .anyMatch(klass ->
//  e.getClass().equals(klass))) { // custom logic goes here } // exception
//  wasn't specified, rethrow else { throw e; } } } }
