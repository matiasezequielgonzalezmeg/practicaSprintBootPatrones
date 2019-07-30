package ar.com.nuevapruebahibernate.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("ar.com.nuevapruebahibernate.repository")
public class DataSourceConfig {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource2")
	public ConfigurationPropertiesOracle propertiesOracle() {
		return new ConfigurationPropertiesOracle();
	}

	@Bean
	public DataSource dataSource() throws SQLException {
		System.out.println("*************************************************");
		System.out.println("ver el userName "+propertiesOracle().getUrl());
		DataSource ds = DataSourceBuilder.create()
				.driverClassName(propertiesOracle().getDriverClassName())
				.url(propertiesOracle().getUrl())
				.username(propertiesOracle().getUsername())
				.password(propertiesOracle().getPassword())
				.build();
		return ds;
	}
}
