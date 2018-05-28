/*
 * Copyright 2017-2018 47 Degrees, LLC. <http://www.47deg.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package freestyle.rpc
package jodatime
package util

import org.joda.time._

object JodaTimeUtil {

  private[this] val initialDate = DateTime.now(DateTimeZone.UTC).withMillis(0)

  def jodaLocalDateToInt(value: LocalDate): Int =
    Days
      .daysBetween(initialDate, value.toDateTimeAtStartOfDay(DateTimeZone.UTC))
      .getDays

  def intToJodaLocalDate(value: Int): LocalDate =
    initialDate.plusDays(value).toLocalDate

  def jodaLocalDatetimeToLong(value: LocalDateTime): Long =
    value.toDateTime(DateTimeZone.UTC).getMillis

  def longToJodaLocalDateTime(value: Long): LocalDateTime =
    new LocalDateTime(value, DateTimeZone.UTC)

}
