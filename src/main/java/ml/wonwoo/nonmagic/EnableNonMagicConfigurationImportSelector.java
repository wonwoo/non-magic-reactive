package ml.wonwoo.nonmagic;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;

public class EnableNonMagicConfigurationImportSelector implements DeferredImportSelector, BeanClassLoaderAware {

    private ClassLoader classLoader;

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return SpringFactoriesLoader.loadFactoryNames(EnableNonMagicConfiguration.class, this.classLoader)
            .toArray(new String[0]);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }
}
