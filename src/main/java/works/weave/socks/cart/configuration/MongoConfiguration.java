package works.weave.socks.cart.configuration;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClientOptions;

@Configuration
@AutoConfigureBefore(MongoAutoConfiguration.class)
public class MongoConfiguration {


    @Bean
    public MongoClientOptions optionsProvider() {
        MongoClientOptions.Builder optionsBuilder = new MongoClientOptions.Builder();
        MongoClientOptions options = optionsBuilder.build();
        return options;
    }
}
