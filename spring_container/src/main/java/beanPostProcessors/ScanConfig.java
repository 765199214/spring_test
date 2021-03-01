package beanPostProcessors;

import org.springframework.context.annotation.ComponentScan;

/**
 * 只扫描  beanPostProcessors  包下的 Bean
 */
@ComponentScan("beanPostProcessors")
public class ScanConfig {
}
