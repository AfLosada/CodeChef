package HOCJson

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

fun main() {
  val jsonString = File("gameJams.json").readText()
  val mapper = jacksonObjectMapper()
  val jsonList: List<Map<String, Any?>> = mapper.readValue(jsonString)
  jsonList.forEach { json -> iterateThroughJsonKeys(json) { (::log)(it) } }
}

fun log(parameter: Any?){
  println(parameter)
}

inline fun iterateThroughJsonKeys(json: Map<String, Any?>, callback: (Any?) -> Unit) {
  json.entries.forEach { (_, value) -> callback(value) }
}