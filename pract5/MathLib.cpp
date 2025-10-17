#include <jni.h>
#include "pract5_MathOperations.h"
extern "C" {
    JNIEXPORT jint JNICALL Java_MathOperations_add(JNIEnv*, jobject, jint a, jint b) {
        return a + b;
    }
    JNIEXPORT jint JNICALL Java_MathOperations_subtract(JNIEnv*, jobject, jint a, jint b) {
        return a - b;
    }
    JNIEXPORT jint JNICALL Java_MathOperations_multiply(JNIEnv*, jobject, jint a, jint b) {
        return a * b;
    }
    JNIEXPORT jint JNICALL Java_MathOperations_divide(JNIEnv*, jobject, jint a, jint b) {
        return b == 0 ? 0 : a / b;
    }
}