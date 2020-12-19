/*
 * Copyright 2020 Gabor Varadi
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
package com.zhuinden.flowziptuplekt

import com.zhuinden.tupleskt.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.flow.*


fun <T1, T2> zipTuple(f1: Flow<T1>, f2: Flow<T2>): Flow<Pair<T1, T2>> =
    f1.zip(f2) { t1, t2 -> Pair(t1, t2) }

fun <T1, T2, T3> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>): Flow<Triple<T1, T2, T3>> =
    zipTuple(f1, f2).zip(f3) { (t1, t2), t3 -> Triple(t1, t2, t3) }

fun <T1, T2, T3, T4> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>): Flow<Tuple4<T1, T2, T3, T4>> =
    zipTuple(f1, f2).zip(zipTuple(f3, f4)) { (t1, t2), (t3, t4) -> Tuple4(t1, t2, t3, t4) }

fun <T1, T2, T3, T4, T5> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>): Flow<Tuple5<T1, T2, T3, T4, T5>> =
    zipTuple(f1, f2, f3, f4).zip(f5) { (t1, t2, t3, t4), t5 -> Tuple5(t1, t2, t3, t4, t5) }

fun <T1, T2, T3, T4, T5, T6> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>): Flow<Tuple6<T1, T2, T3, T4, T5, T6>> =
    zipTuple(f1, f2, f3, f4).zip(zipTuple(f5, f6)) { (t1, t2, t3, t4), (t5, t6) -> Tuple6(t1, t2, t3, t4, t5, t6) }

fun <T1, T2, T3, T4, T5, T6, T7> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>): Flow<Tuple7<T1, T2, T3, T4, T5, T6, T7>> =
    zipTuple(f1, f2, f3, f4, f5, f6).zip(f7) { (t1, t2, t3, t4, t5, t6), t7 -> Tuple7(t1, t2, t3, t4, t5, t6, t7) }

fun <T1, T2, T3, T4, T5, T6, T7, T8> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>): Flow<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> =
    zipTuple(f1, f2, f3, f4, f5, f6).zip(zipTuple(f7, f8)) { (t1, t2, t3, t4, t5, t6), (t7, t8) -> Tuple8(t1, t2, t3, t4, t5, t6, t7, t8) }

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>): Flow<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> =
    zipTuple(f1, f2, f3, f4, f5, f6, f7, f8).zip(f9) { (t1, t2, t3, t4, t5, t6, t7, t8), t9 -> Tuple9(t1, t2, t3, t4, t5, t6, t7, t8, t9) }

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>): Flow<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> =
    zipTuple(f1, f2, f3, f4, f5, f6, f7, f8).zip(zipTuple(f9, f10)) { (t1, t2, t3, t4, t5, t6, t7, t8), (t9, t10) -> Tuple10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10) }

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>): Flow<Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> =
    zipTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10).zip(f11) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10), t11 -> Tuple11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11) }

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>): Flow<Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> =
    zipTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10).zip(zipTuple(f11, f12)) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10), (t11, t12) -> Tuple12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12) }

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>): Flow<Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> =
    zipTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12).zip(f13) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12), t13 -> Tuple13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13) }

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>): Flow<Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> =
    zipTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12).zip(zipTuple(f13, f14)) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12), (t13, t14) -> Tuple14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14) }

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>): Flow<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> =
    zipTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14).zip(f15) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14), t15 -> Tuple15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15) }

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> zipTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>): Flow<Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> =
    zipTuple(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14).zip(zipTuple(f15, f16) { (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14), (t15, t16) -> Tuple16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16) }

fun zipArray(vararg flows: Flow<*>): Flow<Array<*>> {
    fun zipPartial(vararg flows: Flow<*>): Flow<Array<*>> {
        if (flows.isEmpty()) {
            throw IllegalArgumentException("Flows should not be empty!")
        }

        if (flows.size == 1) {
            return flows[0].map { arrayOf(it) }
        }

        if (flows.size == 2) {
            return flows[0].zip(flows[1]) { t1, t2 -> arrayOf(t1, t2) }
        }

        if (flows.size == 3) {
            return zipPartial(flows[0], flows[1]).zip(flows[2]) { arr, t3 -> arrayOf(arr[0], arr[1], t3) }
        }

        if (flows.size == 4) {
            return zipPartial(flows[0], flows[1]).zip(zipPartial(flows[2], flows[3])) { arr1, arr2 -> arrayOf(arr1[0], arr1[1], arr2[0], arr2[1]) }
        }

        throw IllegalArgumentException("Size of portion should not be more than 4")
    }

    if (flows.size <= 4) {
        return zipPartial(*flows)
    }

    val portion = flows.take(4)
    val tail = flows.drop(4)

    return zipPartial(*portion.toTypedArray()).zip(zipArray(*(tail.toTypedArray()))) { arr1, arr2 ->
        Array(arr1.size + arr2.size) { index ->
            if(index < arr1.size) arr1[index]
            else arr2[index - arr1.size]
        }
    }
}
