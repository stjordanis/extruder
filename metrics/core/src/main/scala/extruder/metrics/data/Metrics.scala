package extruder.metrics.data

import shapeless.Coproduct

object Metrics {
  def single(key: MetricKey, value: Numbers): Metrics = Map(key -> value)
  def status(key: List[String], value: String): Metrics = {
    val s: Short = 1
    Map(SimpleMetricKey(value, key, Some(MetricType.Status)) -> Coproduct[Numbers](s))
  }
}
