package com.example.affirmation

import com.example.affirmation.adapter.ItemAdapter
import com.example.affirmation.model.Affirmation
import org.junit.Test
import android.content.Context
import org.mockito.Mockito.mock

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val context = mock(Context::class.java)
    @Test
    fun adapter_size(){
        val data = listOf(
            Affirmation(R.string.affirmation1,R.drawable.image1),
            Affirmation(R.string.affirmation2,R.drawable.image2),
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }

}