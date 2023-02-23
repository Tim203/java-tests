package net.tim203.tests.hi;

import jakarta.inject.Scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface CustomScope {
}
