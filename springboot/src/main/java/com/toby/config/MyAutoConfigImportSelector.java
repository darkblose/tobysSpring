package com.toby.config;

import com.toby.config.annotation.MyAutoConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.annotation.ImportCandidates;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.stream.StreamSupport;

@RequiredArgsConstructor
public class MyAutoConfigImportSelector implements DeferredImportSelector {
    private final ClassLoader classLoader;

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Iterable<String> candidates = ImportCandidates.load(MyAutoConfiguration.class, classLoader);
        return StreamSupport.stream(candidates.spliterator(), false).toArray(String[]::new);
/*
        List<String> autoConfigs = new ArrayList<>();

        for (String candidate : ImportCandidates.load(MyAutoConfigImportSelector.class, classLoader)) {
            autoConfigs.add(candidate);
        }

        ImportCandidates.load(MyAutoConfigImportSelector.class, classLoader).forEach(autoConfigs::add);

        return autoConfigs.stream().toArray(String[]::new);
        return Arrays.copyOf(autoConfigs.toArray(), autoConfigs.size(), String[].class);
*/
    }
}
