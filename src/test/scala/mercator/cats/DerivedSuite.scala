package mercator.cats

import cats.Monad
import cats.syntax.either._
import cats.syntax.option._
import mercator.Monadic
import minitest.SimpleTestSuite
import minitest.api.Void

object DerivedSuite extends SimpleTestSuite {

  test("mercator monadic from cats monad") {
    ensureFor(List(1, 2, 3))
    ensureFor(1.some)
    ensureFor(1.asRight[Int])
    ensureFor(1.asLeft[Int])
    ensureFor((1, 2))
  }

  private def ensureFor[F[_] : Monad, A](fa: F[A]): Void = {
    val a = 42

    assertEquals(monadic[F].point(a), Monad[F].pure(a))
    assertEquals(monadic[F].map(fa)(identity[A]), Monad[F].map(fa)(identity[A]))
    assertEquals(monadic[F].flatMap(fa)(monadic[F].point[A]), Monad[F].flatMap(fa)(Monad[F].pure[A]))
  }

  private def monadic[F[_]](implicit ev: Monadic[F]): Monadic[F] = ev
}
