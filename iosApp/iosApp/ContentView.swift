import SwiftUI
import shared

struct ContentView: View {
//	let greet = Greeting().greeting()
    @ObservedObject private(set) var viewModel: ViewModel

	var body: some View {
        Text(viewModel.text)
            .font(.system(size: 24))
            .frame(alignment: .leading)
	}
}

extension ContentView {
    class ViewModel : ObservableObject {
        @Published var text = "Loading..."
        init() {
            JokesApi().getRandom { jokes, error in
                DispatchQueue.main.async {
                    if let _jokes = jokes {
                        self.text = _jokes
                    } else {
                        self.text = error?.localizedDescription ?? "error"
                    }
                }
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView(viewModel: ContentView.ViewModel())
	}
}
