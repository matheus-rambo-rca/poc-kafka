# Onde KAFKA HOME é onde se encontra o diretório do KAFKA
# 127.0.0.1 -> localhost

KAFKA_HOME/bin/kafka-topics.sh --create \
    --zookeeper 127.0.0.1:2181 \
    --replication-factor 1 \
    --partitions 1 \
    --topic rcatopic
