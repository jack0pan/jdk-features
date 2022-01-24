package jdk.features.pattern;

import jdk.features.pattern.former.UseCase;
import jdk.features.sealed.modern.Rectangle;
import jdk.features.sealed.modern.Shape;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class PatternBench {
    @Benchmark
    public void useCast(Blackhole bh) {
        Shape rect = new Rectangle("rect", 10.0, 10.0);
        bh.consume(jdk.features.pattern.former.UseCase.isSquare(rect));
    }

    @Benchmark
    public void usePattern(Blackhole bh) {
        Shape rect = new Rectangle("rect", 10.0, 10.0);
        bh.consume(jdk.features.pattern.modern.UseCase.isSquare(rect));
    }
}
