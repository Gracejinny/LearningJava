package exercise.chapter_61.meta;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationUtils {
    public static void executeMethodsByRepeatAnnotation(Object object) { // 어노테이션의 정보를 가지고 메소드를 실행
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations(); // 메소드에 있는 어노테이션 가져오기

            for (Annotation annotation : annotations) {
                if (annotation instanceof Repeat) { // 클래스의 타입 확인
                    Repeat repeatAnnotation = (Repeat) annotation;
                    int repeatCount = repeatAnnotation.value();

                    for (int i = 0; i < repeatCount; i++) {
                        try {
                            method.invoke(object);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}