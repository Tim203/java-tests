package net.tim203.tests;

import io.avaje.inject.BeanScope;
import net.tim203.tests.hi.CustomModule;
import net.tim203.tests.hi.ProxyConfig;

public class Main {
    public static void main(String[] args) {
        try (BeanScope scope = BeanScope.builder().modules(new TestsModule(), new CustomModule()).build()) {
            System.out.println(scope.get(Config.class) instanceof ProxyConfig);
            System.out.println(scope.contains(ProxyConfig.class));
        }
    }
}
