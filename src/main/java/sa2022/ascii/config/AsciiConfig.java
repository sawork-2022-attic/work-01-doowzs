package sa2022.ascii.config;

import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsciiConfig {

    @Bean
    public AsciiPanel asciiPanel() {
        return new AsciiPanel(80, 24, asciiFont_CP437_9x16());
    }

    @Bean
    public AsciiFont asciiFont_CP437_9x16() {
        return AsciiFont.CP437_9x16;
    }

    @Bean
    public AsciiFont asciiFont_CP437_8x8() {
        return AsciiFont.CP437_8x8;
    }

}
