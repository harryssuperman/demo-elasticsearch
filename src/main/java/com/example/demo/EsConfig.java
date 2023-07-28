package com.example.demo;

//@Configuration
//@EnableElasticsearchRepositories(basePackages = "com.example.demo")
//public class EsConfig {
//
//    @Value("${elasticsearch.host}")
//    private String EsHost;
//
//    @Value("${elasticsearch.port}")
//    private int EsPort;
//
//    @Value("${elasticsearch.clustername}")
//    private String EsClusterName;
//
//    @Bean
//    public Client client() throws Exception {
//
//        Settings esSettings = Settings.settingsBuilder()
//                .put("cluster.name", EsClusterName)
//                .build();
//
//        //https://www.elastic.co/guide/en/elasticsearch/guide/current/_transport_client_versus_node_client.html
//        return TransportClient.builder()
//                .settings(esSettings)
//                .build()
//                .addTransportAddress(
//                        new InetSocketTransportAddress(InetAddress.getByName(EsHost), EsPort));
//    }
//
//    @Bean
//    public ElasticsearchOperations elasticsearchTemplate() throws Exception {
//        return new ElasticsearchTemplate(client());
//    }
//
//    //Embedded Elasticsearch Server
//    /*@Bean
//    public ElasticsearchOperations elasticsearchTemplate() {
//        return new ElasticsearchTemplate(nodeBuilder().local(true).node().client());
//    }*/
//
//}
