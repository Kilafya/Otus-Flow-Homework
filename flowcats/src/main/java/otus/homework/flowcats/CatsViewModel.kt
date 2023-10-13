package otus.homework.flowcats

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData

class CatsViewModel(
    catsRepository: CatsRepository,
) : ViewModel() {
    val catsLiveData: LiveData<Fact> = catsRepository.listenForCatFacts().asLiveData()
}