Spring consul services


DistributedPropertiesController needs a key value config in consul
* Example

consul kv put config/message-center/ws/prop "ws://localhost:8888/socket"
